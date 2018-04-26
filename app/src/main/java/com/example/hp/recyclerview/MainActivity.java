package com.example.hp.recyclerview;

import android.app.SearchManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem search = menu.findItem(R.id.search);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) search.getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        //by setting it true we are making it iconified
        //so the search input will show up after taping the search iconified
        //if you want to make it visible all the time make it false
        searchView.setIconifiedByDefault(true);

        searchView.setQueryHint("Search Pokemon...");
        searchView.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Pokemon");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        ArrayList<Pokemon> arrayList = new ArrayList<>();

        arrayList.add(new Pokemon("Bulbasaur", R.drawable.bulbasaur));
        arrayList.add(new Pokemon("Ivysaur", R.drawable.ivysaur));
        arrayList.add(new Pokemon("Venusaur", R.drawable.venusaur));
        arrayList.add(new Pokemon("Charmander", R.drawable.charmander));
        arrayList.add(new Pokemon("Charmeleon", R.drawable.charmeleon));
        arrayList.add(new Pokemon("Charizard", R.drawable.charizard));
        arrayList.add(new Pokemon("Squirtle", R.drawable.squirtle));
        arrayList.add(new Pokemon("Wartortle", R.drawable.wartortle));
        arrayList.add(new Pokemon("Blastoise", R.drawable.blastoise));
        arrayList.add(new Pokemon("Caterpie", R.drawable.caterpie));
        arrayList.add(new Pokemon("Metapod", R.drawable.metapod));
        arrayList.add(new Pokemon("Butterfree", R.drawable.butterfree));
        arrayList.add(new Pokemon("Weedle", R.drawable.weedle));
        arrayList.add(new Pokemon("Kakuna", R.drawable.kakuna));
        arrayList.add(new Pokemon("Beedrill", R.drawable.beedrill));
        arrayList.add(new Pokemon("Pidgey", R.drawable.pidgey));
        arrayList.add(new Pokemon("Pidgeotto", R.drawable.pidgeotto));
        arrayList.add(new Pokemon("Pidgeot", R.drawable.pidgeot));
        arrayList.add(new Pokemon("Rattata", R.drawable.rattata));
        arrayList.add(new Pokemon("Raticate", R.drawable.raticate));
        arrayList.add(new Pokemon("Spearow", R.drawable.spearow));
        arrayList.add(new Pokemon("Fearow", R.drawable.fearow));
        arrayList.add(new Pokemon("Ekans", R.drawable.ekans));
        arrayList.add(new Pokemon("Arbok", R.drawable.arbok));
        arrayList.add(new Pokemon("Pikachu", R.drawable.pikachu));
        arrayList.add(new Pokemon("Raichu", R.drawable.raichu));
        arrayList.add(new Pokemon("Sandshrew", R.drawable.sandshrew));
        arrayList.add(new Pokemon("Sandslash", R.drawable.sandslash));
        arrayList.add(new Pokemon("Nidoran(female)", R.drawable.nidoran));
        arrayList.add(new Pokemon("Nidorina", R.drawable.nidorina));
        arrayList.add(new Pokemon("Nidoqueen", R.drawable.nidoqueen));
        arrayList.add(new Pokemon("Nidoran(male)", R.drawable.nidoran_male));
        arrayList.add(new Pokemon("Nidorino", R.drawable.nidorino));
        arrayList.add(new Pokemon("Nidoking", R.drawable.nidoking));
        arrayList.add(new Pokemon("Clefairy", R.drawable.clefairy));
        arrayList.add(new Pokemon("Clefable", R.drawable.clefable));
        arrayList.add(new Pokemon("Vulpix", R.drawable.vulpix));
        arrayList.add(new Pokemon("Ninetales", R.drawable.ninetales));
        arrayList.add(new Pokemon("Jigglypuff", R.drawable.jigglypuff));
        arrayList.add(new Pokemon("Wigglypuff", R.drawable.wigglytuff));
        arrayList.add(new Pokemon("Zubat", R.drawable.zubat));
        arrayList.add(new Pokemon("Golbat", R.drawable.golbat));
        arrayList.add(new Pokemon("Oddish", R.drawable.oddish));
        arrayList.add(new Pokemon("Gloom", R.drawable.gloom));
        arrayList.add(new Pokemon("Vileplume", R.drawable.vileplume));
        arrayList.add(new Pokemon("Paras", R.drawable.paras));
        arrayList.add(new Pokemon("Parasect", R.drawable.parasect));
        arrayList.add(new Pokemon("Venonat", R.drawable.venonat));
        arrayList.add(new Pokemon("Venomoth", R.drawable.venomoth));
        arrayList.add(new Pokemon("Diglett", R.drawable.diglett));
        arrayList.add(new Pokemon("Dugtrio", R.drawable.dugtrio));
        arrayList.add(new Pokemon("Meowth", R.drawable.meowth));
        arrayList.add(new Pokemon("Persian", R.drawable.persian));
        arrayList.add(new Pokemon("Psyduck", R.drawable.psyduck));
        arrayList.add(new Pokemon("Golduck", R.drawable.golduck));
        arrayList.add(new Pokemon("Mankey", R.drawable.mankey));
        arrayList.add(new Pokemon("Primeape", R.drawable.primeape));
        arrayList.add(new Pokemon("Growlithe", R.drawable.growlithe));
        arrayList.add(new Pokemon("Arcanine", R.drawable.arcanine));
        arrayList.add(new Pokemon("Poliwag", R.drawable.poliwag));
        arrayList.add(new Pokemon("Poliwhirl", R.drawable.poliwhirl));
        arrayList.add(new Pokemon("Poliwrath", R.drawable.poliwrath));
        arrayList.add(new Pokemon("Abra", R.drawable.abra));
        arrayList.add(new Pokemon("Kadabra", R.drawable.kadabra));
        arrayList.add(new Pokemon("Alakazam", R.drawable.alakazam));
        arrayList.add(new Pokemon("Machop", R.drawable.machop));
        arrayList.add(new Pokemon("Machoke", R.drawable.machoke));
        arrayList.add(new Pokemon("Machamp", R.drawable.machamp));
        arrayList.add(new Pokemon("Bellsprout", R.drawable.bellsprout));
        arrayList.add(new Pokemon("Weepinbell", R.drawable.weepinbell));
        arrayList.add(new Pokemon("Victreebel", R.drawable.victreebel));
        arrayList.add(new Pokemon("Tentacool", R.drawable.tentacool));
        arrayList.add(new Pokemon("Tentacruel", R.drawable.tentacruel));
        arrayList.add(new Pokemon("Geodude", R.drawable.geodude));
        arrayList.add(new Pokemon("Graveler", R.drawable.graveler));
        arrayList.add(new Pokemon("Golem", R.drawable.golem));
        arrayList.add(new Pokemon("Ponyta", R.drawable.ponyta));
        arrayList.add(new Pokemon("Rapidash", R.drawable.rapidash));
        arrayList.add(new Pokemon("Slowpoke", R.drawable.slowpoke));
        arrayList.add(new Pokemon("Slowbro", R.drawable.slowbro));
        arrayList.add(new Pokemon("Magnemite", R.drawable.magnemite));
        arrayList.add(new Pokemon("Magneton", R.drawable.magneton));
        arrayList.add(new Pokemon("Doduo", R.drawable.doduo));
        arrayList.add(new Pokemon("Dodrio", R.drawable.dodrio));
        arrayList.add(new Pokemon("Seel", R.drawable.seel));
        arrayList.add(new Pokemon("Dewgong", R.drawable.dewgong));
        arrayList.add(new Pokemon("Grimer", R.drawable.grimer));
        arrayList.add(new Pokemon("Muk", R.drawable.muk));
        arrayList.add(new Pokemon("Shellder", R.drawable.shellder));
        arrayList.add(new Pokemon("Cloyster", R.drawable.cloyster));
        arrayList.add(new Pokemon("Gastly", R.drawable.gastly));
        arrayList.add(new Pokemon("Haunter", R.drawable.haunter));
        arrayList.add(new Pokemon("Gengar", R.drawable.gengar));
        arrayList.add(new Pokemon("Onix", R.drawable.onix));
        arrayList.add(new Pokemon("Drowzee", R.drawable.drowzee));
        arrayList.add(new Pokemon("Hypno", R.drawable.hypno));
        arrayList.add(new Pokemon("Krabby", R.drawable.krabby));
        arrayList.add(new Pokemon("Kingler", R.drawable.kingler));
        arrayList.add(new Pokemon("Farfetch'd", R.drawable.farfetch_d));
        arrayList.add(new Pokemon("Voltorb", R.drawable.voltorb));
        arrayList.add(new Pokemon("Electrode", R.drawable.electrode));
        arrayList.add(new Pokemon("Exeggcute", R.drawable.exeggcute));
        arrayList.add(new Pokemon("Exeggutor", R.drawable.exeggutor));
        arrayList.add(new Pokemon("Cubone", R.drawable.cubone));
        arrayList.add(new Pokemon("Marowak", R.drawable.marowak));
        arrayList.add(new Pokemon("Hitmonlee", R.drawable.hitmonlee));
        arrayList.add(new Pokemon("Hitmonchan", R.drawable.hitmonchan));
        arrayList.add(new Pokemon("Lickitung", R.drawable.lickitung));
        arrayList.add(new Pokemon("Koffing", R.drawable.koffing));
        arrayList.add(new Pokemon("Weezing", R.drawable.weezing));
        arrayList.add(new Pokemon("Rhyhorn", R.drawable.rhyhorn));
        arrayList.add(new Pokemon("Rhydon", R.drawable.rhydon));
        arrayList.add(new Pokemon("Chansey", R.drawable.chansey));
        arrayList.add(new Pokemon("Tangela", R.drawable.tangela));
        arrayList.add(new Pokemon("Kangaskhan", R.drawable.kangaskhan));
        arrayList.add(new Pokemon("Horsea", R.drawable.horsea));
        arrayList.add(new Pokemon("Seadra", R.drawable.seadra));
        arrayList.add(new Pokemon("Goldeen", R.drawable.goldeen));
        arrayList.add(new Pokemon("Seaking", R.drawable.seaking));
        arrayList.add(new Pokemon("Staryu", R.drawable.staryu));
        arrayList.add(new Pokemon("Starmie", R.drawable.starmie));
        arrayList.add(new Pokemon("Mr. Mime", R.drawable.mr_mime));
        arrayList.add(new Pokemon("Scyther", R.drawable.scyther));
        arrayList.add(new Pokemon("Jynx", R.drawable.jynx));
        arrayList.add(new Pokemon("Electabuzz", R.drawable.electabuzz));
        arrayList.add(new Pokemon("Magmar", R.drawable.magmar));
        arrayList.add(new Pokemon("Pinsir", R.drawable.pinsir));
        arrayList.add(new Pokemon("Tauros", R.drawable.tauros));
        arrayList.add(new Pokemon("Magikarp", R.drawable.magikarp));
        arrayList.add(new Pokemon("Gyarados", R.drawable.gyarados));
        arrayList.add(new Pokemon("Lapras", R.drawable.lapras));
        arrayList.add(new Pokemon("Ditto", R.drawable.ditto));
        arrayList.add(new Pokemon("Eevee", R.drawable.eevee));
        arrayList.add(new Pokemon("Vaporeon", R.drawable.vaporeon));
        arrayList.add(new Pokemon("Jolteon", R.drawable.jolteon));
        arrayList.add(new Pokemon("Flareon", R.drawable.flareon));
        arrayList.add(new Pokemon("Porygon", R.drawable.porygon));
        arrayList.add(new Pokemon("Omanyte", R.drawable.omanyte));
        arrayList.add(new Pokemon("Omaster", R.drawable.omastar));
        arrayList.add(new Pokemon("Kabuto", R.drawable.kabuto));
        arrayList.add(new Pokemon("Kabutops", R.drawable.kabutops));
        arrayList.add(new Pokemon("Aerodactyl", R.drawable.aerodactyl));
        arrayList.add(new Pokemon("Snorlax", R.drawable.snorlax));
        arrayList.add(new Pokemon("Articuno", R.drawable.articuno));
        arrayList.add(new Pokemon("Zapdos", R.drawable.zapdos));
        arrayList.add(new Pokemon("Moltres", R.drawable.moltres));
        arrayList.add(new Pokemon("Dratini", R.drawable.dratini));
        arrayList.add(new Pokemon("Dragonair", R.drawable.dragonair));
        arrayList.add(new Pokemon("Dragonite", R.drawable.dragonite));
        arrayList.add(new Pokemon("Mewtwo", R.drawable.mewtwo));


        PokemonAdapter adapter = new PokemonAdapter(arrayList);

        recyclerView.setAdapter(adapter);

    }
}
