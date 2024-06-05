package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

public class BaseListDiffCallback<K extends ListDiffInterface<BaseListDiffCallback>> extends DiffUtil.ItemCallback<K> implements ListDiffInterface<K> {

     @Override
    public boolean areItemsTheSame(@NonNull K oldItem, @NonNull K newItem) {;
         return theSameAs(K k);
    }

    @Override
    public boolean areContentsTheSame(@NonNull K oldItem, @NonNull K newItem) {
        return false;
    }

}