package com.lsl.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by liusilong on 2018/1/24.
 * version:1.0
 * Describe:
 */

public enum EcIcons implements Icon {
    icon_scan('\ue606'),
    icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
