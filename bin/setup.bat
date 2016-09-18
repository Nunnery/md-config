@REM
@REM This file is part of MythicDrops Configurator, licensed under the MIT License.
@REM
@REM Copyright (C) 2016 Richard Harrah
@REM
@REM Permission is hereby granted, free of charge,
@REM to any person obtaining a copy of this software and associated documentation files (the "Software"),
@REM to deal in the Software without restriction, including without limitation the rights to use,
@REM copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
@REM and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
@REM
@REM The above copyright notice and this permission notice shall be included in all copies or
@REM substantial portions of the Software.
@REM
@REM THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
@REM INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
@REM FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
@REM OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
@REM WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
@REM CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
@REM

@ECHO OFF
heroku git:remote -a md-config-staging
heroku git:remote -a md-config-production