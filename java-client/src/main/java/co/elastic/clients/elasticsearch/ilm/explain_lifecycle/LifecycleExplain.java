/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ilm.explain_lifecycle.LifecycleExplain

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplain">API
 *      specification</a>
 */
@JsonpDeserializable
public class LifecycleExplain
		implements
			TaggedUnion<LifecycleExplain.Kind, LifecycleExplainVariant>,
			JsonpSerializable {

	/**
	 * {@link LifecycleExplain} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplain">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		True("true"),

		False("false"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final LifecycleExplainVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final LifecycleExplainVariant _get() {
		return _value;
	}

	public LifecycleExplain(LifecycleExplainVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._lifecycleExplainKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private LifecycleExplain(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static LifecycleExplain of(Function<Builder, ObjectBuilder<LifecycleExplain>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code true}?
	 */
	public boolean isTrue() {
		return _kind == Kind.True;
	}

	/**
	 * Get the {@code true} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code true} kind.
	 */
	public LifecycleExplainManaged true_() {
		return TaggedUnionUtils.get(this, Kind.True);
	}

	/**
	 * Is this variant instance of kind {@code false}?
	 */
	public boolean isFalse() {
		return _kind == Kind.False;
	}

	/**
	 * Get the {@code false} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code false} kind.
	 */
	public LifecycleExplainUnmanaged false_() {
		return TaggedUnionUtils.get(this, Kind.False);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<LifecycleExplain> {
		private Kind _kind;
		private LifecycleExplainVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<LifecycleExplain> true_(LifecycleExplainManaged v) {
			this._kind = Kind.True;
			this._value = v;
			return this;
		}

		public ObjectBuilder<LifecycleExplain> true_(
				Function<LifecycleExplainManaged.Builder, ObjectBuilder<LifecycleExplainManaged>> fn) {
			return this.true_(fn.apply(new LifecycleExplainManaged.Builder()).build());
		}

		public ObjectBuilder<LifecycleExplain> false_(LifecycleExplainUnmanaged v) {
			this._kind = Kind.False;
			this._value = v;
			return this;
		}

		public ObjectBuilder<LifecycleExplain> false_(
				Function<LifecycleExplainUnmanaged.Builder, ObjectBuilder<LifecycleExplainUnmanaged>> fn) {
			return this.false_(fn.apply(new LifecycleExplainUnmanaged.Builder()).build());
		}

		public LifecycleExplain build() {
			_checkSingleUse();
			return new LifecycleExplain(this);
		}

	}

	protected static void setupLifecycleExplainDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::true_, LifecycleExplainManaged._DESERIALIZER, "true");
		op.add(Builder::false_, LifecycleExplainUnmanaged._DESERIALIZER, "false");

		op.setTypeProperty("managed", null);

	}

	public static final JsonpDeserializer<LifecycleExplain> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LifecycleExplain::setupLifecycleExplainDeserializer, Builder::build);
}
