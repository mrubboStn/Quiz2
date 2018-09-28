package pkgCarPayment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void CarCost_test() {
		double totalPrice = 50000;
		double downPayment = 8000;
		double loanLength = 48;
		double interestRate = 12;
		CarPayment  newCar = new CarPayment(totalPrice, downPayment, loanLength, interestRate);
		Assertions.assertEquals(newCar.monthlyPaymentRounded, 1106);
		Assertions.assertEquals(newCar.totalInterestRounded, 3088);
	}

}
