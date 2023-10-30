import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocationservicesComponent } from './locationservices.component';

describe('LocationservicesComponent', () => {
  let component: LocationservicesComponent;
  let fixture: ComponentFixture<LocationservicesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LocationservicesComponent]
    });
    fixture = TestBed.createComponent(LocationservicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
