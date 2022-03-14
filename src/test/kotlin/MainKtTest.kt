import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommissionMastercard_oneTimeTransfer() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0

        val result = getCommission(currentAmount, previousAmount, accountMastercard)

        assertEquals(commissionAmount, result)
    }

    @Test
    fun getCommissionMastercard_summaryMonthAmount() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00

        val result = getCommission(currentAmount, previousAmount, accountMastercard)

        assertEquals(commissionAmount, result)

    }
    @Test
    fun getCommissionMaestro_oneTimeTransfer() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0

        val result = getCommission(currentAmount, previousAmount, accountMaestro)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionMaestro_summaryMonthAmount() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00

        val result = getCommission(currentAmount, previousAmount, accountMaestro)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionVisa_oneTimeTransfer() {
        val accountVisa = CardType.Visa
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00

        val result = getCommission(currentAmount, previousAmount, accountVisa)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionVisa_summaryMonthAmount() {
        val accountVisa = CardType.Visa
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00

        val result = getCommission(currentAmount, previousAmount, accountVisa)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionMir_oneTimeTransfer() {
        val accountMir = CardType.Mir
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00

        val result = getCommission(currentAmount, previousAmount, accountMir)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionMir_summaryMonthAmount() {
        val accountMir = CardType.Mir
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00

        val result = getCommission(currentAmount, previousAmount, accountMir)

        assertEquals(commissionAmount, result)
    }
    @Test
    fun getCommissionVkPay() {
        val accountVkPay = CardType.VkPay
        val currentAmount = 0
        val previousAmount = 100_000

        val result = getCommission(currentAmount, previousAmount, accountVkPay)
        assertEquals(0, result)
    }
}
