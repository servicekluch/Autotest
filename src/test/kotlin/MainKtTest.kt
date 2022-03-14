import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommission_MastercardOneTimeTransfer() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0

        val result = getCommission(currentAmount, previousAmount, accountMastercard)

        assertEquals(commissionAmount, result)
    }

    @Test
    fun getCommission_MastercardSummaryMonthAmount() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00

        val result = getCommission(currentAmount, previousAmount, accountMastercard)

        assertEquals(commissionAmount, result)

    }
    @Test
    fun getCommission_MaestroOneTimeTransfer() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0

        val result = getCommission(currentAmount, previousAmount, accountMaestro)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_MaestroSummaryMonthAmount() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00

        val result = getCommission(currentAmount, previousAmount, accountMaestro)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_VisaOneTimeTransfer() {
        val accountVisa = CardType.Visa
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00

        val result = getCommission(currentAmount, previousAmount, accountVisa)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_VisaSummaryMonthAmount() {
        val accountVisa = CardType.Visa
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00

        val result = getCommission(currentAmount, previousAmount, accountVisa)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_MirOneTimeTransfer() {
        val accountMir = CardType.Mir
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00

        val result = getCommission(currentAmount, previousAmount, accountMir)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_MirSummaryMonthAmount() {
        val accountMir = CardType.Mir
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00

        val result = getCommission(currentAmount, previousAmount, accountMir)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommission_VkPay() {
        val accountVkPay = CardType.VkPay
        val currentAmount = 0
        val previousAmount = 100_000

        val result = getCommission(currentAmount, previousAmount, accountVkPay)
        assertEquals(0, result)
    }
}
