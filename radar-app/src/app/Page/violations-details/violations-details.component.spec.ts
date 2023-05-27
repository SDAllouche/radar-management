import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViolationsDetailsComponent } from './violations-details.component';

describe('ViolationsDetailsComponent', () => {
  let component: ViolationsDetailsComponent;
  let fixture: ComponentFixture<ViolationsDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViolationsDetailsComponent]
    });
    fixture = TestBed.createComponent(ViolationsDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
