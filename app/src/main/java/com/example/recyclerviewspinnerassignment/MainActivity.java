package com.example.recyclerviewspinnerassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler);

        List<President> presidentList = new ArrayList<>();
        presidentList.add(new President("Richard Nixon","Richard Milhous Nixon (January 9, 1913 – April 22, 1994) was an American politician who served as the 37th president of the United States from 1969 until his resignation in 1974. The only president to resign from the office, he previously served as the nation's 36th vice president from 1953 to 1961, and as a representative and senator from California.\n" +
                "\n" +
                "Nixon was born in Yorba Linda, California. He completed his undergraduate studies at Whittier College, then graduated from Duke University School of Law in 1937 and returned to California to practice law",R.drawable.richard));
        presidentList.add(new President("Gerald Ford","First president to ascend to the presidency without being elected to either the offices of the president or vice presiden",R.drawable.gerald));
        presidentList.add(new President("Jimmy Carter","First president who completed at least one full term in office and never made a nomination to the United States Supreme Court.",R.drawable.jimmy));
        presidentList.add(new President("Ronald Reagan","First president to be re-elected over the age of seventy, as he was 73 years old when he was re-elected in 1984.",R.drawable.ronald));
        presidentList.add(new President("George H. W. Bush","First president to have served as acting president (when Reagan was sedated for eight hours due to colon surgery",R.drawable.gor));
        presidentList.add(new President("Bill Clinton","William Jefferson Clinton (born William Jefferson Blythe III; August 19, 1946) is an American politician who served as the 42nd president of the United States from 1993 to 2001. Prior to his presidency, he served as governor of Arkansas (1979-1981 and 1983-1992) and as attorney general of Arkansas (1977-1979). A member of the Democratic Party, Clinton was known as a New Democrat, and many of his policies reflected a centrist \"Third Way\" political philosophy. He is the husband of former Secretary of State and former U.S. Senator Hillary Clinton. Clinton is notable as one of only two U.S. presidents",R.drawable.bill));
        presidentList.add(new President("Lyndon B. Johnson","Lyndon Baines Johnson (/ˈlɪndən ˈbeɪnz/; August 27, 1908 – January 22, 1973), often referred to by the initials LBJ, was an American politician who served as the 36th president of the United States from 1963 to 1969. Formerly the 37th vice president from 1961 to 1963, he assumed the presidency following the assassination of President John F. Kennedy. A Democrat from Texas, Johnson also served as a United States Representative and as the Majority Leader in the United States Senate. Johnson is one of only four people who have served in all four federal elected positions",R.drawable.lyon));
        presidentList.add(new President("John F. Kennedy","John Fitzgerald Kennedy (May 29, 1917 – November 22, 1963), often referred to by the initials JFK and Jack, was an American politician who served as the 35th president of the United States from January 1961 until his assassination in November 1963. Kennedy served at the height of the Cold War, and the majority of his work as president dealt with managing relations with the Soviet Union and Cuba. A Democrat, Kennedy represented Massachusetts in the U.S. House of Representatives and Senate prior to becoming president.",R.drawable.john));
        presidentList.add(new President("Barack Obama","Barack Hussein Obama II (/bəˈrɑːk huːˈseɪn oʊˈbɑːmə/ (About this soundlisten);[1] born August 4, 1961) is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, he was the first African American to be elected to the presidency. He previously served as a U.S. senator from Illinois from 2005 to 2008 and an Illinois state senator from 1997 to 2004.",R.drawable.barak));
        presidentList.add(new President("Donald Trump Bush","Donald John Trump (born June 14, 1946) is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality.\n" +
                "\n" +
                "Trump was born and raised in the New York City borough of Queens, and received a B.S. degree in economics from the Wharton School at the University of Pennsylvania. He took charge of his family's real-estate business in 1971, renamed it The Trump Organization, and expanded its operations from Queens and Brooklyn into Manhattan. ",R.drawable.donald));


        PresidentAdapter presidentAdapter = new PresidentAdapter(this,presidentList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }
}
