package org.cx4a.rsense.ruby;

public class MetaClass extends RubyClass {
    private IRubyObject attached;

    public MetaClass(Ruby runtime, RubyClass superClass) {
        super(runtime, superClass);
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public RubyClass getRealClass() {
        return superClass.getRealClass();
    }

    @Override
    public RubyClass makeMetaClass(RubyClass superClass) {
        RubyClass klass = super.makeMetaClass(superClass);
        klass.setSuperClass(getSuperClass().getRealClass().getMetaClass());
        return klass;
    }

    public IRubyObject getAttached() {
        return attached;
    }

    public void setAttached(IRubyObject attached) {
        this.attached = attached;
    }

    @Override
    public String toMethodPathString() {
        return attached.toString() + ".";
    }

    @Override
    public String toString() {
        return "<" + attached.toString() + ">";
    }
}
