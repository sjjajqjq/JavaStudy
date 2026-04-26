package com.itheima.calcDemo;

public class blockSearch {
    // 索引块结构：记录每一块的最大值、起始下标、结束下标
    static class Block {
        int max;    // 当前块最大值
        int start;  // 块起始下标
        int end;    // 块结束下标

        Block(int max, int start, int end) {
            this.max = max;
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        // 原始数据（分成3块）
        // 0~2 是第1块，3~5 是第2块，6~8 是第3块
        int[] arr = {16, 5, 9, 21, 18, 30, 35, 40, 50};

        // 建立“块索引表”
        Block[] blocks = {
                new Block(16, 0, 2), // 第1块最大值16
                new Block(30, 3, 5), // 第2块最大值30
                new Block(50, 6, 8)  // 第3块最大值50
        };

        int target = 18;
        int index = blockSearch(arr, blocks, target);

        if (index != -1) {
            System.out.println("找到 " + target + "，下标是: " + index);
        } else {
            System.out.println("没找到 " + target);
        }
    }

    // 分块查找
    public static int blockSearch(int[] arr, Block[] blocks, int target) {
        // 1) 先找 target 属于哪一块
        int blockIndex = -1;
        for (int i = 0; i < blocks.length; i++) {
            if (target <= blocks[i].max) {
                blockIndex = i;
                break;
            }
        }

        // 如果 target 比最后一块最大值还大，直接不存在
        if (blockIndex == -1) {
            return -1;
        }

        // 2) 在该块内顺序查找
        int start = blocks[blockIndex].start;
        int end = blocks[blockIndex].end;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i; // 找到返回下标
            }
        }

        return -1; // 块内没找到
    }
}
