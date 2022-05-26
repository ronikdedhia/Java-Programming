import java.util.*;

class first_fit {
    static void firstFit(int blockSize[],
            int m, int processSize[], int n) {
        int allocation[] = new int[n];
        for (int i = 0; i < allocation.length; i++)
            allocation[i] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (blockSize[j] >= processSize[i]) {
                    allocation[i] = j;
                    blockSize[j] -= processSize[i];
                    break;
                }
            }
        }
        System.out.println("\nProcess No.\tProcess Size\tBlock no.");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + (i + 1) +
                    "\t\t" + processSize[i] + "\t\t");
            if (allocation[i] != -1)
                System.out.print(allocation[i] + 1);
            else
                System.out.print("Not Allocated");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int blockSize[];
        blockSize = new int[100];
        int processSize[];
        processSize = new int[100];
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of blocks");
        m = sc.nextInt();
        System.out.println("Enter number of Process");
        n = sc.nextInt();
        System.out.println("Enter the block size");
        for (int i = 0; i < m; i++) {
            blockSize[i] = sc.nextInt();
        }
        System.out.println("Enter the Processsize");
        for (int i = 0; i < n; i++) {
            processSize[i] = sc.nextInt();
        }
        firstFit(blockSize, m, processSize, n);
    }
}