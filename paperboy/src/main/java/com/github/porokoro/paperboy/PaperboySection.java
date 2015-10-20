/*
 * Copyright (C) 2015 porokoro
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.porokoro.paperboy;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

class PaperboySection {
    private String             m_name;
    private List<PaperboyItem> m_items;

    public PaperboySection() {
        m_name = "";
        m_items = new ArrayList<>();
    }

    @NonNull
    public String getName() {
        return m_name;
    }

    public void setName(@NonNull String name) {
        m_name = name;
    }

    @NonNull
    public List<PaperboyItem> getItems() {
        return m_items;
    }

    public void setItems(@NonNull List<PaperboyItem> items) {
        m_items = items;
    }
}
