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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.LifecycleExplain
@JsonpDeserializable
public class LifecycleExplain implements TaggedUnion<JsonpSerializable>, JsonpSerializable {

	public static final String TRUE = "true";
	public static final String FALSE = "false";

	// Tagged union implementation

	private final String _type;
	private final JsonpSerializable _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public JsonpSerializable _get() {
		return _value;
	}

	public LifecycleExplain(LifecycleExplainVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private LifecycleExplain(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code true} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code true} kind.
	 */
	public LifecycleExplainManaged true_() {
		return TaggedUnionUtils.get(this, TRUE);
	}

	/**
	 * Get the {@code false} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code false} kind.
	 */
	public LifecycleExplainUnmanaged false_() {
		return TaggedUnionUtils.get(this, FALSE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		_value.serialize(generator, mapper);

	}

	public static class Builder {
		private String _type;
		private JsonpSerializable _value;

		public ObjectBuilder<LifecycleExplain> true_(LifecycleExplainManaged v) {
			this._type = TRUE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<LifecycleExplain> true_(
				Function<LifecycleExplainManaged.Builder, ObjectBuilder<LifecycleExplainManaged>> f) {
			return this.true_(f.apply(new LifecycleExplainManaged.Builder()).build());
		}

		public ObjectBuilder<LifecycleExplain> false_(LifecycleExplainUnmanaged v) {
			this._type = FALSE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<LifecycleExplain> false_(
				Function<LifecycleExplainUnmanaged.Builder, ObjectBuilder<LifecycleExplainUnmanaged>> f) {
			return this.false_(f.apply(new LifecycleExplainUnmanaged.Builder()).build());
		}

		protected LifecycleExplain build() {
			return new LifecycleExplain(this);
		}

	}

	protected static void setupLifecycleExplainDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::true_, LifecycleExplainManaged._DESERIALIZER, "true");
		op.add(Builder::false_, LifecycleExplainUnmanaged._DESERIALIZER, "false");

		op.setTypeProperty("managed");
	}

	public static final JsonpDeserializer<LifecycleExplain> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			LifecycleExplain::setupLifecycleExplainDeserializer, Builder::build);
}
