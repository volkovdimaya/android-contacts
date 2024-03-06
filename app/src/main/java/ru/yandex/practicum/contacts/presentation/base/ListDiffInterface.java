package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<T extends ListDiffInterface> {


    public boolean theSameAs(T t);



    public boolean equals(Object o);
}
