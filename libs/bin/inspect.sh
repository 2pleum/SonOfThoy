#!/bin/sh
# Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
# ------------------------------------------------------
# IntelliJ IDEA offline inspection script.
# ------------------------------------------------------

export DEFAULT_PROJECT_PATH="$(pwd)"

IDE_BIN_HOME="${0%/*}"
exec "$IDE_BIN_HOME/../MacOS/idea" inspect "$@"