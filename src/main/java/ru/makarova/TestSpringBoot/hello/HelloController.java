package ru.makarova.TestSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    private List<String> arrayList = new ArrayList<>();
    private Map<Integer, String> hashMap = new HashMap<>();

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",
                        defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam String s) {
        if (arrayList.isEmpty()) {
            arrayList.add(s);
        } else {
            arrayList.set(0, s);
        }
        return "ArrayList updated with: " + s;
    }

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return arrayList;
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam String s) {
        if (hashMap.isEmpty()) {
            hashMap.put(1, s);
        } else {
            int nextKey = hashMap.keySet().stream().mapToInt(Integer::intValue).max().orElse(0) + 1;
            hashMap.put(nextKey, s);
        }
        return "HashMap updated with: " + s;
    }

    @GetMapping("/show-map")
    public Map<Integer, String> showHashMap() {
        return hashMap;
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListSize = arrayList.size();
        int hashMapSize = hashMap.size();
        return "ArrayList size: " + arrayListSize + ", HashMap size: " + hashMapSize;
    }
}
