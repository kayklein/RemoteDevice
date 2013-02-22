package de.kayklein.service;

import static android.app.Service.START_STICKY;

/**
 * Android system remote shell service.
 * User: it-kay-klein
 * Date: 22.02.13
 * Time: 19:26
 */
public class ShellService /*extends Service*/ {

    public int onStartCommand() {
        return START_STICKY;
    }
}
