package com.jad.customer;

import com.jad.show.ConcertShow;
import com.jad.show.MovieShow;
import com.jad.show.StreetShow;
import com.jad.show.TheaterShow;

public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(MovieShow show);
    void watch(TheaterShow show);
    void watch(StreetShow show);
    void watch(ConcertShow show);
}
