//package com.group_4_trial_1.Nutri_App_user_Trial.config;
//
//import com.group_4_trial_1.Nutri_App_user_Trial.entity.DietPlan;
//import com.group_4_trial_1.Nutri_App_user_Trial.entity.NutritionPlan;
//import com.group_4_trial_1.Nutri_App_user_Trial.entity.User;
//import com.group_4_trial_1.Nutri_App_user_Trial.repository.DietPlanRepo;
//import com.group_4_trial_1.Nutri_App_user_Trial.repository.NutritionPlanRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.group_4_trial_1.Nutri_App_user_Trial.repository.UserRepository;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//import static java.time.Month.JANUARY;
//
//@Configuration
//public class UserConfig {
//
//    @Bean
//    CommandLineRunner userCommandLineRunner(UserRepository repository) {
//        return args -> {
//            User mariam = new User(
//
//                    "mariam007",
//                "Mariam",
//                    "9564525874",
//                    "Female",
//                    LocalDate.of(1999, JANUARY, 1)
//            );
//
//            User alex = new User(
//
//                    "alex009",
//                    "Alex",
//                    "8975469871",
//                    "Male",
//                    LocalDate.of(2004, JANUARY, 1)
//            );
////
//            repository.saveAll(
//                    List.of(mariam, alex)
//            );
////            repository.save(mariam);
//        };
//    }
//
//    @Bean
//    CommandLineRunner dietPlanCommandLineRunner(DietPlanRepo dietPlanRepo) {
//        return args -> {
//            DietPlan diet1 = new DietPlan("mariam007", "hjvjhvhj",
//                    "jhvjh", "ghccjhchc", "fuyfyuf",
//                    "uyfuyfyf", "jjuvuivu");
//            DietPlan diet2 = new DietPlan("alex009", "hjvjhvhj",
//                    "jhvjh", "ghccjhchc", "fuyfyuf",
//                    "uyfuyfyf", "jjuvuivu");
//            dietPlanRepo.saveAll(List.of(diet1, diet2));
//        };
//    }
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            NutritionPlanRepository repository) {
//        return args -> {
//            NutritionPlan Suresh = new NutritionPlan (
//                    "Suresh",
//                    "Eating Healthy Foods",
//                    LocalDate.of(2022, Month.OCTOBER,10),
//                    LocalDate.of(2022, Month.OCTOBER,14),
//                    5000
//            );
//
//            NutritionPlan Ramesh = new NutritionPlan (
//                    "Ramesh",
//                    "Eating Fatty Foods",
//                    LocalDate.of(2022, Month.SEPTEMBER,30),
//                    LocalDate.of(2022, Month.OCTOBER,11),
//                    4000
//            );
//
//            repository.saveAll(
//                    List.of(Suresh,Ramesh)
//            );
//        };
//
//    }
//}
