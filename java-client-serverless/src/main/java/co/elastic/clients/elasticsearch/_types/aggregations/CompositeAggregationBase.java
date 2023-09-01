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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregationBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregationBase">API
 *      specification</a>
 */

public abstract class CompositeAggregationBase implements JsonpSerializable {
	@Nullable
	private final String field;

	@Nullable
	private final Boolean missingBucket;

	@Nullable
	private final MissingOrder missingOrder;

	@Nullable
	private final Script script;

	@Nullable
	private final ValueType valueType;

	@Nullable
	private final SortOrder order;

	// ---------------------------------------------------------------------------------------------

	protected CompositeAggregationBase(AbstractBuilder<?> builder) {

		this.field = builder.field;
		this.missingBucket = builder.missingBucket;
		this.missingOrder = builder.missingOrder;
		this.script = builder.script;
		this.valueType = builder.valueType;
		this.order = builder.order;

	}

	/**
	 * Either <code>field</code> or <code>script</code> must be present
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code missing_bucket}
	 */
	@Nullable
	public final Boolean missingBucket() {
		return this.missingBucket;
	}

	/**
	 * API name: {@code missing_order}
	 */
	@Nullable
	public final MissingOrder missingOrder() {
		return this.missingOrder;
	}

	/**
	 * Either <code>field</code> or <code>script</code> must be present
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public final ValueType valueType() {
		return this.valueType;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
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

		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.missingBucket != null) {
			generator.writeKey("missing_bucket");
			generator.write(this.missingBucket);

		}
		if (this.missingOrder != null) {
			generator.writeKey("missing_order");
			this.missingOrder.serialize(generator, mapper);
		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.valueType != null) {
			generator.writeKey("value_type");
			this.valueType.serialize(generator, mapper);
		}
		if (this.order != null) {
			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String field;

		@Nullable
		private Boolean missingBucket;

		@Nullable
		private MissingOrder missingOrder;

		@Nullable
		private Script script;

		@Nullable
		private ValueType valueType;

		@Nullable
		private SortOrder order;

		/**
		 * Either <code>field</code> or <code>script</code> must be present
		 * <p>
		 * API name: {@code field}
		 */
		public final BuilderT field(@Nullable String value) {
			this.field = value;
			return self();
		}

		/**
		 * API name: {@code missing_bucket}
		 */
		public final BuilderT missingBucket(@Nullable Boolean value) {
			this.missingBucket = value;
			return self();
		}

		/**
		 * API name: {@code missing_order}
		 */
		public final BuilderT missingOrder(@Nullable MissingOrder value) {
			this.missingOrder = value;
			return self();
		}

		/**
		 * Either <code>field</code> or <code>script</code> must be present
		 * <p>
		 * API name: {@code script}
		 */
		public final BuilderT script(@Nullable Script value) {
			this.script = value;
			return self();
		}

		/**
		 * Either <code>field</code> or <code>script</code> must be present
		 * <p>
		 * API name: {@code script}
		 */
		public final BuilderT script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code value_type}
		 */
		public final BuilderT valueType(@Nullable ValueType value) {
			this.valueType = value;
			return self();
		}

		/**
		 * API name: {@code order}
		 */
		public final BuilderT order(@Nullable SortOrder value) {
			this.order = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCompositeAggregationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(AbstractBuilder::missingBucket, JsonpDeserializer.booleanDeserializer(), "missing_bucket");
		op.add(AbstractBuilder::missingOrder, MissingOrder._DESERIALIZER, "missing_order");
		op.add(AbstractBuilder::script, Script._DESERIALIZER, "script");
		op.add(AbstractBuilder::valueType, ValueType._DESERIALIZER, "value_type");
		op.add(AbstractBuilder::order, SortOrder._DESERIALIZER, "order");

	}

}
