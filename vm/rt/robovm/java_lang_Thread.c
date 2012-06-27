/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#include <robovm.h>

JavaThread* Java_java_lang_Thread_currentThread(Env* env, Class* cls) {
    return env->currentThread->threadObj;
}

jlong Java_java_lang_Thread_internalStart(Env* env, Class* cls, JavaThread* t) {
    return rvmStartThread(env, t);
}

void Java_java_lang_Thread_internalSleep(Env* env, Class* cls, jlong millis, jint nanos) {
    rvmThreadSleep(env, millis, nanos);
}

jboolean Java_java_lang_Thread_internalInterrupted(Env* env, Class* cls) {
    jboolean interrupted = env->currentThread->interrupted;
    env->currentThread->interrupted = FALSE;
    return interrupted;
}

jboolean Java_java_lang_Thread_internalIsInterrupted(Env* env, Class* cls, JavaThread* threadObj) {
    rvmLockThreadsList();
    Thread* thread = (Thread*) LONG_TO_PTR(threadObj->threadPtr);
    jboolean interrupted = FALSE;
    if (thread) {
        interrupted = thread->interrupted;
    }
    rvmUnlockThreadsList();
    return interrupted;
}

void Java_java_lang_Thread_internalInterrupt(Env* env, Class* cls, JavaThread* threadObj) {
    rvmLockThreadsList();
    Thread* thread = (Thread*) LONG_TO_PTR(threadObj->threadPtr);
    if (thread) {
        rvmThreadInterrupt(env, thread);
    }
    rvmUnlockThreadsList();
}

jboolean Java_java_lang_Thread_internalHoldsLock(Env* env, Class* cls, Object* obj) {
    if (!obj) {
        rvmThrowNullPointerException(env);
        return FALSE;
    }
    rvmLockThreadsList();
    jboolean result = rvmHoldsLock(env, env->currentThread, obj);
    rvmUnlockThreadsList();
    return result;
}

void Java_java_lang_Thread_internalYield(Env* env, Class* cls) {
    sched_yield();
}

jint Java_java_lang_Thread_internalGetState(Env* env, Class* cls, JavaThread* threadObj) {
    rvmLockThreadsList();
    Thread* thread = (Thread*) LONG_TO_PTR(threadObj->threadPtr);
    jint status = THREAD_ZOMBIE; // If thread==NULL we assume the thread has been finished
    if (thread) {
        status = thread->status;
    }
    rvmUnlockThreadsList();
    return status;
}
