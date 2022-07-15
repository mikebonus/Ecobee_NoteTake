// Generated by Dagger (https://dagger.dev).
package com.example.noteapp.ui.list;

import com.example.noteapp.repository.NoteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ListViewModel_Factory implements Factory<ListViewModel> {
  private final Provider<NoteRepository> repositoryProvider;

  public ListViewModel_Factory(Provider<NoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ListViewModel_Factory create(Provider<NoteRepository> repositoryProvider) {
    return new ListViewModel_Factory(repositoryProvider);
  }

  public static ListViewModel newInstance(NoteRepository repository) {
    return new ListViewModel(repository);
  }
}