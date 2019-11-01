package com.example.proyek3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyek3.tankAdapters.tankAdapter;
import com.example.proyek3.tankModels.tankModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvTank;
    ArrayList<tankModel>tankList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTank = findViewById(R.id.rvtank);

        tankList = new ArrayList<>();
        tankList.add(new tankModel("M1A1 Abrams","The M1A1 Abrams main battle tank from U.S.A was developed by General Dynamics. It is a further development of the M1 Abrams. The M1A1 has an improved armor protection comparing with its predecessor. Front turret and hull armor of the M1A1 features advanced composite armor reinforced with depleted uranium mesh for better protection. One of the most important improvement over the M1 is the M256 120 mm smoothbore gun, originally developed by Rheinmetall and produced in USA under license. The same gun is fitted on the Leopard 2 up to the version of the 2A5.",R.drawable.m1));
        tankList.add(new tankModel("T-90","The T-90 Main Battle Tank (MBT) is a further development of the T-72. It was adopted by the Russian Army in 1993. The T-90 is considered to be among the 10 best main battle tanks in the world. Currently it is the most commercially successful main battle tank on the global market. The T-90 saw action during the military conflicts in Ukraine and Syria. The T-90 MBT uses a well proven chassis of the T-72 and turret with all weapon systems of the T-80U.  It has a welded composite armor hull with a built-in Kontakt-5 explosive reactive armor blocks.",R.drawable.t90));
        tankList.add(new tankModel("Leopard 2A5","The Leopard 2A5 From Germany, this main battle tank is a radically improved variant of the Leopard 2. It was introduced in 1990. By 1998 a total of 225 German Army Leopard 2 main battle tanks were upgraded to the 2A5 standard. At that time the Leopard 2A5 was referred as the best main battle tank in the world. The 2A5 has significantly improved armor protection comparing with its predecessor. Turret is fitted with a wedge-shaped add-on modular armor. Add-on modular armor panels were also fitted at the front of the hull.The Leopard 2A5 also received a more powerful armament. It is fitted with improved 120 mm/L44 smoothbore gun.",R.drawable.l2a5));
        tankList.add(new tankModel("Leclerc","The Leclerc main battle tank was developed by GIAT Industries From France. Its development began in 1978 and first prototypes were built in 1989. Production of the Leclerc MBT started in 1991. It is named in honor to general Philippe Jacques Leclerc, commander of French armored division during World War II. The Leclerc is one of the best main battle tanks in the world. It is in service with France (406), Saudi Arabia and United Arab Emirates (388). Some sources claim that currently only 340 Leclercs remain in service with the French Army.",R.drawable.lecrec));


        LinearLayoutManager layoutManager = new GridLayoutManager(this,2);
        RecyclerView.LayoutManager rvlayout = layoutManager;
        rvTank.setLayoutManager(rvlayout);

        tankAdapter adapter = new tankAdapter(this, tankList);
        rvTank.setAdapter(adapter);
    }
}
