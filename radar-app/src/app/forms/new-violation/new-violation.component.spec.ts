import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewViolationComponent } from './new-violation.component';

describe('NewViolationComponent', () => {
  let component: NewViolationComponent;
  let fixture: ComponentFixture<NewViolationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NewViolationComponent]
    });
    fixture = TestBed.createComponent(NewViolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
