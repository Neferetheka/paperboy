/*
 * Copyright (C) 2015-2016 Dominik Hibbeln
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.porokoro.paperboy

data class ItemType(
        var id: Int = 0,
        var name: String = "",
        var shorthand: String = "",
        var titleSingular: String = "",
        var titlePlural: String = "",
        var color: Int = 0,
        var icon: Int = 0,
        var sortOrder: Int = Int.MAX_VALUE)
