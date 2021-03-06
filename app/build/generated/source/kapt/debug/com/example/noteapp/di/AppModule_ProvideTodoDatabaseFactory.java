// Generated by Dagger (https://dagger.dev).
package com.example.noteapp.di;

import android.app.Application;
import com.example.noteapp.data.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTodoDatabaseFactory implements Factory<NoteDatabase> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideTodoDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public NoteDatabase get() {
    return provideTodoDatabase(appProvider.get());
  }

  public static AppModule_ProvideTodoDatabaseFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideTodoDatabaseFactory(appProvider);
  }

  public static NoteDatabase provideTodoDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTodoDatabase(app));
  }
}
