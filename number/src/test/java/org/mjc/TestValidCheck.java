package org.mjc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TestValidCheck {
    @Test
    public void testValid() {

         MjcValidCheck mvc = new MjcValidCheck();
        assertThat(mvc.isValidPhoneNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-3992")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("02-7487-0203")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("02-d35a-1s32")).isEqualTo(false);
        assertThat(mvc.isValidPhoneNumber("010-1111-2222")).isEqualTo(true);
        System.out.println(mvc.isValidPhoneNumber("010-1111-2222"));


        assertThat(mvc.isValidZipNumber(null)).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("24@32")).isEqualTo(false);
        assertThat(mvc.isValidZipNumber("24510")).isEqualTo(true);
        System.out.println(mvc.isValidZipNumber("24510"));

        assertThat(mvc.isValidEmail(null)).isEqualTo(false);
        assertThat(mvc.isValidEmail("")).isEqualTo(false);
        assertThat(mvc.isValidEmail("130adsa")).isEqualTo(false);
        assertThat(mvc.isValidEmail("coups1234@naver.com")).isEqualTo(true);
        System.out.println(mvc.isValidEmail("coups1234@naver.com"));

    }
}
