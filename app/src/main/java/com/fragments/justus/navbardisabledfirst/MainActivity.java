package com.fragments.justus.navbardisabledfirst;

import android.content.Intent;
import android.graphics.Color;
import android.provider.Contacts;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;


public class MainActivity extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {
        // check in the styles.xml

        

        this.addSection(newSection("Section 1", new TrendsFragment()));
        this.addSection(newSection("Section 2", new TrendsFragment()));

        // create bottom section
        this.addBottomSection(newSection("Bottom Section",new Intent(this,Contacts.Settings.class)));
    }
}
