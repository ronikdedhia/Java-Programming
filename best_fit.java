import java.util.*;
public class best_fit {
    static void bestFit(int blockSize[], int m, int processSize[], int n) {
        int allocation[] = new int[n];
        for (int i = 0; i < allocation.length; i++)
            allocation[i] = -1;
        for (int i = 0; i < n; i++) {
            int bestIdx = -1;
            for (int j = 0; j < m; j++) {
                if (blockSize[j] >= processSize[i]) {
                    if (bestIdx == -1)
                        bestIdx = j;
                    else if (blockSize[bestIdx] > blockSize[j])
                        bestIdx = j;
                }
            }
            if (bestIdx != -1) {
                allocation[i] = bestIdx;
                blockSize[bestIdx] -= processSize[i];
            }
        }
        System.out.println("\nProcess No.\tProcess Size\tBlockno.");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + (i + 1) + "\t\t" + processSize[i] +
                    "\t\t");
            if (allocation[i] != -1)
                System.out.print(allocation[i] + 1);
            else
                System.out.print("NotAllocated");
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
        System.out.println("Enter the Process size");
        for (int i = 0; i < n; i++) {
            processSize[i] = sc.nextInt();
        }
        bestFit(blockSize, m, processSize, n);
    }
}