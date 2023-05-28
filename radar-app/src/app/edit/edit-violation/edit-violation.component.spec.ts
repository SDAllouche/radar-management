import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditViolationComponent } from './edit-violation.component';

describe('EditViolationComponent', () => {
  let component: EditViolationComponent;
  let fixture: ComponentFixture<EditViolationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditViolationComponent]
    });
    fixture = TestBed.createComponent(EditViolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
