package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<T extends ListDiffInterface> {


    public boolean theSameAs(@NonNull T t);



    public boolean equals(@NonNull  Object o);
}
