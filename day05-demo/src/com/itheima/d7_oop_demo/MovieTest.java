package com.itheima.d7_oop_demo;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie1 = new Movie(1, "731", 10, 49, "姜武");
        Movie movie2 = new Movie(2, "长津湖", 9, 59, "吴京");
        Movie movie3 = new Movie(3, "流浪地球", 8, 45, "吴孟达");
        Movie movie4 = new Movie(4, "你好，李焕英", 7, 39, "贾玲");
        Movie movie5 = new Movie(5, "唐人街探案", 6, 42, "王宝强");
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};
        while (true) {
            System.out.println("------------欢迎来到电影信息管理系统------------");
            System.out.println("1: 添加电影");
            System.out.println("2: 删除电影");
            System.out.println("3: 修改电影");
            System.out.println("4: 查询电影");
            System.out.println("5: 根据id查询电影");
            System.out.println("6: 根据名称查询电影");
            System.out.println("7: 退出");
            System.out.println("请输入您的选择:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> System.out.println("添加电影");
                case 2 -> System.out.println("删除电影");
                case 3 -> updataMovies(movies);
                case 4 -> queryMoviesArray(movies);
                case 5 -> findMoviesById(movies);
                case 6 -> findMoviesByName(movies);
                case 7 -> {
                    System.out.println("欢迎下次使用!");
                    return;
                }
                default -> System.out.println("您的选择不合法");
            }
        }
    }
// 修改电影
    public static void updataMovies(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要修改的电影id:");
            int id = sc.nextInt();
            int index = getMovieId(movies, id);
            if (index < 0) {
                System.out.println("电影id不存在更新失败,请重新输入!");
                continue;
            } else {
                System.out.println("电影id查询成功!");
                System.out.println("请输入要修改的电影名称:");
                String newMovieName = sc.next();
                movies[index].setName(newMovieName);
                System.out.println("电影名称修改成功!");
                System.out.println("请输入要修改的电影评分:");
                double newMovieScore = sc.nextDouble();
                movies[index].setScore(newMovieScore);
                System.out.println("电影评分修改成功!");
                System.out.println("请输入要修改的电影价格:");
                double newMoviePrice = sc.nextDouble();
                movies[index].setPrice(newMoviePrice);
                System.out.println("电影价格修改成功!");
                System.out.println("请输入要修改的电影导演:");
                String newMovieActor = sc.next();
                movies[index].setActor(newMovieActor);
                System.out.println("电影导演修改成功!");
                break;

            }
        }


    }
//查询所有电影
    public static void queryMoviesArray(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println("电影序列:" + movie.getId() + "\t" + "电影名称:" + movie.getName() + "\t" + "得分:" + movie.getScore() + "\t" + "价格:" + movie.getPrice() + "\t" + "导演:" + movie.getActor());
        }
    }
//通过id查询电影
    public static void findMoviesById(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要查询的id:");
            int id = sc.nextInt();
            int index = getMovieId(movies, id);
            //checkIndex(movies, index);
            if (index < 0) {
                System.out.println("查询失败ID不存在");
                 continue;
            } else {
                Movie movie = movies[index];
                System.out.println("查询成功!");
                System.out.println("电影序列:" + movie.getId() + "\t" + "电影名称:" + movie.getName() + "\t" + "得分:" + movie.getScore() + "\t" + "价格:" + movie.getPrice() + "\t" + "导演:" + movie.getActor());
                break;
            }
        }

    }
//通过名称查询电影
    public static void findMoviesByName(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要查询的电影名称:");
            String findMovieName = sc.next();
            int index = getIndex(movies, findMovieName);
            //checkIndex(movies, index);
            if (index < 0) {
                System.out.println("查询失败名称不存在");
                continue;
            } else {
                Movie movie = movies[index];
                System.out.println("电影序列:" + movie.getId() + "\t" + "电影名称:" + movie.getName() + "\t" + "得分:" + movie.getScore() + "\t" + "价格:" + movie.getPrice() + "\t" + "导演:" + movie.getActor());
                break;
            }
        }
    }
//通过电影名称获取电影索引
    public static int getIndex(Movie[] movies, String name) {
        for (int i = 0; i < movies.length; i++) {
            if (name.equals(movies[i].getName())) {
                return i;
            }
        }
        return -1;
    }
//获取电影id获取电影索引
    public static int getMovieId(Movie[] movies, int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

/*    public static void checkIndex(Movie[] movies, int index) {
        if (index >= 0) {
            Movie movie = movies[index];
            System.out.println("电影序列:" + movie.getId() + "\t" + "电影名称:" + movie.getName() + "\t" + "得分:" + movie.getScore() + "\t" + "价格:" + movie.getPrice() + "\t" + "导演:" + movie.getActor());
        } else {
            System.out.println("查询失败电影不存在");
        }
    }*/
}


