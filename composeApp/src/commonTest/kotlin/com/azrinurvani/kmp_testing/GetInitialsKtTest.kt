import assertk.assertThat
import assertk.assertions.isEqualTo
import com.azrinurvani.kmp_testing.getInitials
import kotlin.test.Test

class GetInitialsKtTest{

    @Test
    fun testGetInitials(){
        val fullName = "Azri Nurvani"
        assertThat(getInitials(fullName)).isEqualTo("AN")
    }
}