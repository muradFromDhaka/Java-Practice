import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjecViewComponent } from './projec-view.component';

describe('ProjecViewComponent', () => {
  let component: ProjecViewComponent;
  let fixture: ComponentFixture<ProjecViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProjecViewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProjecViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
