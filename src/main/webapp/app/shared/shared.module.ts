import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { KotlinWebBasicSharedLibsModule, KotlinWebBasicSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [KotlinWebBasicSharedLibsModule, KotlinWebBasicSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [KotlinWebBasicSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KotlinWebBasicSharedModule {
  static forRoot() {
    return {
      ngModule: KotlinWebBasicSharedModule
    };
  }
}
