package se.lexicon.manage_spring.util;

import java.util.Scanner;

//@Component
public class ScannerInputService implements UserInputService {

	private Scanner scan;

//	@Autowired
//	public ScannerInputService(Scanner scan) {
//		this.scan = scan;
//	}

	public ScannerInputService() {
		// TODO Auto-generated constructor stub
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	@Override
	public String getString() {
		return scan.nextLine();
	}

	/**
	 * Get String which is not just empty space
	 * 
	 * @return valid String
	 */
	@Override
	public String getNoEmptyString() {
		while (true) {
			String re = getString().trim();
			if (!re.equals("")) {
				return re;
			} else {
				System.out.println("Not a valid enter.(Empty)");
			}
		}
	}

}
