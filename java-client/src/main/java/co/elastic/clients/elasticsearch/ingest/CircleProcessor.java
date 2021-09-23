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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.CircleProcessor
public final class CircleProcessor extends ProcessorBase {
	private final Number errorDistance;

	private final String field;

	private final Boolean ignoreMissing;

	private final ShapeType shapeType;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	public CircleProcessor(Builder builder) {
		super(builder);

		this.errorDistance = Objects.requireNonNull(builder.errorDistance, "error_distance");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = Objects.requireNonNull(builder.ignoreMissing, "ignore_missing");
		this.shapeType = Objects.requireNonNull(builder.shapeType, "shape_type");
		this.targetField = Objects.requireNonNull(builder.targetField, "target_field");

	}

	/**
	 * API name: {@code error_distance}
	 */
	public Number errorDistance() {
		return this.errorDistance;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code shape_type}
	 */
	public ShapeType shapeType() {
		return this.shapeType;
	}

	/**
	 * API name: {@code target_field}
	 */
	public String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("error_distance");
		generator.write(this.errorDistance.doubleValue());

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

		generator.writeKey("shape_type");
		this.shapeType.serialize(generator, mapper);

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CircleProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CircleProcessor> {
		private Number errorDistance;

		private String field;

		private Boolean ignoreMissing;

		private ShapeType shapeType;

		private String targetField;

		/**
		 * API name: {@code error_distance}
		 */
		public Builder errorDistance(Number value) {
			this.errorDistance = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code shape_type}
		 */
		public Builder shapeType(ShapeType value) {
			this.shapeType = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public Builder targetField(String value) {
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

			return new CircleProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CircleProcessor}
	 */
	public static final JsonpDeserializer<CircleProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CircleProcessor::setupCircleProcessorDeserializer);

	protected static void setupCircleProcessorDeserializer(DelegatingDeserializer<CircleProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::errorDistance, JsonpDeserializer.numberDeserializer(), "error_distance");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::shapeType, ShapeType.DESERIALIZER, "shape_type");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
