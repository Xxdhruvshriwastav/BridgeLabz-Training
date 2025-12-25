import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() returns [0.0, 1.0), multiply by 900000 and add 100000 to get 100000-999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in an array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    // Main method
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        // Check uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
