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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ArrayCompareCondition
@JsonpDeserializable
public class ArrayCompareCondition implements ConditionVariant, JsonpSerializable {
	private final String arrayPath;

	private final String comparison;

	private final String path;

	private final Quantifier quantifier;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private ArrayCompareCondition(Builder builder) {

		this.arrayPath = ModelTypeHelper.requireNonNull(builder.arrayPath, this, "arrayPath");
		this.comparison = ModelTypeHelper.requireNonNull(builder.comparison, this, "comparison");
		this.path = ModelTypeHelper.requireNonNull(builder.path, this, "path");
		this.quantifier = ModelTypeHelper.requireNonNull(builder.quantifier, this, "quantifier");
		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static ArrayCompareCondition of(Function<Builder, ObjectBuilder<ArrayCompareCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Condition} variant type
	 */
	@Override
	public String _variantType() {
		return "array_compare";
	}

	/**
	 * Required - API name: {@code array_path}
	 */
	public final String arrayPath() {
		return this.arrayPath;
	}

	/**
	 * Required - API name: {@code comparison}
	 */
	public final String comparison() {
		return this.comparison;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code quantifier}
	 */
	public final Quantifier quantifier() {
		return this.quantifier;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final JsonData value() {
		return this.value;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("array_path");
		generator.write(this.arrayPath);

		generator.writeKey("comparison");
		generator.write(this.comparison);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("quantifier");
		this.quantifier.serialize(generator, mapper);
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ArrayCompareCondition}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ArrayCompareCondition> {
		private String arrayPath;

		private String comparison;

		private String path;

		private Quantifier quantifier;

		private JsonData value;

		/**
		 * Required - API name: {@code array_path}
		 */
		public final Builder arrayPath(String value) {
			this.arrayPath = value;
			return this;
		}

		/**
		 * Required - API name: {@code comparison}
		 */
		public final Builder comparison(String value) {
			this.comparison = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code quantifier}
		 */
		public final Builder quantifier(Quantifier value) {
			this.quantifier = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(JsonData value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link ArrayCompareCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ArrayCompareCondition build() {
			_checkSingleUse();

			return new ArrayCompareCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ArrayCompareCondition}
	 */
	public static final JsonpDeserializer<ArrayCompareCondition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ArrayCompareCondition::setupArrayCompareConditionDeserializer, Builder::build);

	protected static void setupArrayCompareConditionDeserializer(
			DelegatingDeserializer<ArrayCompareCondition.Builder> op) {

		op.add(Builder::arrayPath, JsonpDeserializer.stringDeserializer(), "array_path");
		op.add(Builder::comparison, JsonpDeserializer.stringDeserializer(), "comparison");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::quantifier, Quantifier._DESERIALIZER, "quantifier");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
