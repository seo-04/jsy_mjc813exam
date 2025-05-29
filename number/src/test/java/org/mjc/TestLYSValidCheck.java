package org.mjc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestLYSValidCheck {
    @Test
    public void testValid() {

        com.lysmjc813.lib.MjcVaildCheck mvc = new com.lysmjc813.lib.MjcVaildCheck();
        assertThat(mvc.isVaildPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("010-3992")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("02-7487-0203")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("02-d35a-1s32")).isEqualTo(false);
        assertThat(mvc.isVaildPhoneNumber("010-1111-2222")).isEqualTo(true);
        System.out.println(mvc.isVaildPhoneNumber("010-1111-2222"));


        assertThat(mvc.isVaildZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("")).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("24@32")).isEqualTo(false);
        assertThat(mvc.isVaildZipNumber("24510")).isEqualTo(true);
        System.out.println(mvc.isVaildZipNumber("24510"));

        assertThat(mvc.isVaildEmail(null)).isEqualTo(false);
        assertThat(mvc.isVaildEmail("")).isEqualTo(false);
        assertThat(mvc.isVaildEmail("130adsa")).isEqualTo(false);
        assertThat(mvc.isVaildEmail("coups1234@naver.com")).isEqualTo(true);
        System.out.println(mvc.isVaildEmail("coups1234@naver.com"));

    }
}
