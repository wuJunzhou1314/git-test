package com.zpark.git;

/**
 * 合并分支：
 *   其他的分支需要合并到master
 *      失误的操作：把master分支合并到hot-fix分支上！错误
 *      把其他分支合并到master分支上，
 *         1、切换到master（主角视觉）
 *         2、到其他分支上执行合并的操作
 */
public class TestGit {

    public static void main(String[] args) {
        System.out.println("IDEA test Git! --master");
        System.out.println("IDEA test Git! --master1");
        System.out.println("IDEA test Git! --hot-fix");
        System.out.println("IDEA test Git! --hot-fix1");
        System.out.println("hot-fix test!");
        System.out.println("master test!");
    }

}
