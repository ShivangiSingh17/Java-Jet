

/*Java program to demonstrate a solution for Deadlock in Multi-threading */

public class Deadlock {

	public static Object Resource1 = new Object(); /* Creating 2 objects in order to acquire lock */
	public static Object Resource2 = new Object();

	public static void main(String args[]) {

		ThreadDemo1 T1 = new ThreadDemo1(); /* Creating 2 thread objects */
		ThreadDemo2 T2 = new ThreadDemo2();

		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread { /* Illustration of thread by extending Thread class*/

		public void run() {
			synchronized (Resource1) {
				System.out.println("Thread 1: Holding Resource 1..."); /* Thread 1 acquiring lock on Resource 1 */

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(
						"Thread 1: Waiting for Resource 2..."); /*
																 * Thread 1 in waiting state while it is trying to
																 * acquire Resource 2 but already locked
																 */

				synchronized (Resource2) {
					System.out
							.println("Thread 1: Holding Resource 1 & 2..."); /* Thread 1 acquiring lock on Resource 2 */
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread { /* Illustration of thread by extending Thread class*/
		public void run() {
			synchronized (Resource1) {
				System.out.println("Thread 2: Holding Resource 1..."); /* Thread 2 acquiring lock on Resource 1 */

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(
						"Thread 2: Waiting for Resource 2..."); /*
																 * Thread 2 in waiting state while it is trying to
																 * acquire Resource 2 but already locked
																 */

				synchronized (Resource2) {
					System.out
							.println("Thread 2: Holding Resource 1 & 2..."); /* Thread 2 acquiring lock on Resource 2 */
				}
			}
		}
	}
}
