package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;

public class Hit {

    Map<Long, Integer> hitMap = new LinkedHashMap<>();

    private int last_minutes = 5;
    public void saveHitCount(long timestamp) {

        if(hitMap.containsKey(timestamp)) {
            hitMap.put(timestamp, hitMap.get(timestamp) +1);
        } else {
            hitMap.put(timestamp, 1);
        }

    }

    public int getHits(long timestamp) {

        if(timestamp == 0)
            return 0;

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId());
        LocalDateTime calculated_date = date.minusMinutes(last_minutes);
        int counts = 0;
        for(Map.Entry entry : hitMap.entrySet()) {
            if((long)entry.getKey() >= calculated_date.toInstant(ZoneOffset.UTC).getEpochSecond() && (long) entry.getKey() <= date.toInstant(ZoneOffset.UTC).getEpochSecond()) {
                counts = counts + (int)entry.getValue();
            } else if((long)entry.getKey() < calculated_date.getSecond())
                break;
        }

        return counts;

    }



    public void printCharacters(String data, String keyword) {

        String[] words = data.split(" ");
        int previousIndex =0;
        for(int i =0; i< words.length;++i) {
            if(words[i] == keyword) {
                    if (i - 2 >= 0 && i-previousIndex >=2)
                        System.out.println(words[i - 2]);
                    if (i - 1 >= 0 && i-previousIndex >=1)
                        System.out.println(words[i - 1]);
                    if (i + 1 < words.length)
                        System.out.println(words[i + 1]);
                    if (i + 2 < words.length)
                        System.out.println(words[i + 2]);

                previousIndex =i;

            }
        }
    }








































}
