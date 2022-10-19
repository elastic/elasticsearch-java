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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.CircleProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.CircleProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class CircleProcessor extends ProcessorBase implements ProcessorVariant {
	private final double errorDistance;

	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final ShapeType shapeType;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private CircleProcessor(Builder builder) {
		super(builder);

		this.errorDistance = ApiTypeHelper.requireNonNull(builder.errorDistance, this, "errorDistance");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.shapeType = ApiTypeHelper.requireNonNull(builder.shapeType, this, "shapeType");
		this.targetField = builder.targetField;

	}

	public static CircleProcessor of(Function<Builder, ObjectBuilder<CircleProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Circle;
	}

	/**
	 * Required - API name: {@code error_distance}
	 */
	public final double errorDistance() {
		return this.errorDistance;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - API name: {@code shape_type}
	 */
	public final ShapeType shapeType() {
		return this.shapeType;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("error_distance");
		generator.write(this.errorDistance);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		generator.writeKey("shape_type");
		this.shapeType.serialize(generator, mapper);
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CircleProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CircleProcessor> {
		private Double errorDistance;

		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private ShapeType shapeType;

		@Nullable
		private String targetField;

		/**
		 * Required - API name: {@code error_distance}
		 */
		public final Builder errorDistance(double value) {
			this.errorDistance = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - API name: {@code shape_type}
		 */
		public final Builder shapeType(ShapeType value) {
			this.shapeType = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CircleProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CircleProcessor build() {
			_checkSingleUse();

			return new CircleProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CircleProcessor}
	 */
	public static final JsonpDeserializer<CircleProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CircleProcessor::setupCircleProcessorDeserializer);

	protected static void setupCircleProcessorDeserializer(ObjectDeserializer<CircleProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::errorDistance, JsonpDeserializer.doubleDeserializer(), "error_distance");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::shapeType, ShapeType._DESERIALIZER, "shape_type");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
