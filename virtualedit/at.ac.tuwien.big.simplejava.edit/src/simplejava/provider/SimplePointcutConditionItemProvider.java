/**
 */
package simplejava.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simplejava.SimplePointcutCondition;
import simplejava.SimplejavaFactory;
import simplejava.SimplejavaPackage;

/**
 * This is the item provider adapter for a {@link simplejava.SimplePointcutCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplePointcutConditionItemProvider extends PointcutConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePointcutConditionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimplePointcutCondition_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimplePointcutCondition_type_feature", "_UI_SimplePointcutCondition_type"),
				 SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SimplePointcutCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimplePointcutCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimplePointcutCondition)object).getType();
		return label == null || label.length() == 0 ?
			getString("_UI_SimplePointcutCondition_type") :
			getString("_UI_SimplePointcutCondition_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimplePointcutCondition.class)) {
			case SimplejavaPackage.SIMPLE_POINTCUT_CONDITION__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimplejavaPackage.SIMPLE_POINTCUT_CONDITION__CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createSimpleJava()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createAspect()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createForeignAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPointcut()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPointcutCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createUnaryPointcutCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createBinaryPointcutCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createSimplePointcutCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPointcutMethodFilter()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPointcutTypeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPointcutRef()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createPackageDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createClassDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createMethodBlock()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createSimpleStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createSimpleVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createForInStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createGenericExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createIntegerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SimplejavaPackage.Literals.SIMPLE_POINTCUT_CONDITION__CONDITION,
				 SimplejavaFactory.eINSTANCE.createParanthesisOrBinaryExpression()));
	}

}
