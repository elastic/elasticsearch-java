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

package co.elastic.clients.elasticsearch.ingest;

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
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.InferenceConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceConfig implements TaggedUnion<InferenceConfig.Kind, Object>, JsonpSerializable {

	/**
	 * {@link InferenceConfig} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#ingest._types.InferenceConfig">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Regression("regression"),

		Classification("classification"),

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
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public InferenceConfig(InferenceConfigVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._inferenceConfigKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private InferenceConfig(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static InferenceConfig of(Function<Builder, ObjectBuilder<InferenceConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code regression}?
	 */
	public boolean isRegression() {
		return _kind == Kind.Regression;
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public InferenceConfigRegression regression() {
		return TaggedUnionUtils.get(this, Kind.Regression);
	}

	/**
	 * Is this variant instance of kind {@code classification}?
	 */
	public boolean isClassification() {
		return _kind == Kind.Classification;
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public InferenceConfigClassification classification() {
		return TaggedUnionUtils.get(this, Kind.Classification);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InferenceConfig> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<InferenceConfig> regression(InferenceConfigRegression v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfig> regression(
				Function<InferenceConfigRegression.Builder, ObjectBuilder<InferenceConfigRegression>> fn) {
			return this.regression(fn.apply(new InferenceConfigRegression.Builder()).build());
		}

		public ObjectBuilder<InferenceConfig> classification(InferenceConfigClassification v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfig> classification(
				Function<InferenceConfigClassification.Builder, ObjectBuilder<InferenceConfigClassification>> fn) {
			return this.classification(fn.apply(new InferenceConfigClassification.Builder()).build());
		}

		public InferenceConfig build() {
			_checkSingleUse();
			return new InferenceConfig(this);
		}

	}

	protected static void setupInferenceConfigDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::regression, InferenceConfigRegression._DESERIALIZER, "regression");
		op.add(Builder::classification, InferenceConfigClassification._DESERIALIZER, "classification");

	}

	public static final JsonpDeserializer<InferenceConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InferenceConfig::setupInferenceConfigDeserializer, Builder::build);
}
