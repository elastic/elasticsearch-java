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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ValidationLoss
@JsonpDeserializable
public class ValidationLoss implements JsonpSerializable {
	private final List<String> foldValues;

	private final String lossType;

	// ---------------------------------------------------------------------------------------------

	private ValidationLoss(Builder builder) {

		this.foldValues = ModelTypeHelper.unmodifiableRequired(builder.foldValues, this, "foldValues");
		this.lossType = ModelTypeHelper.requireNonNull(builder.lossType, this, "lossType");

	}

	public static ValidationLoss of(Function<Builder, ObjectBuilder<ValidationLoss>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Validation loss values for every added decision tree during the
	 * forest growing procedure.
	 * <p>
	 * API name: {@code fold_values}
	 */
	public final List<String> foldValues() {
		return this.foldValues;
	}

	/**
	 * Required - The type of the loss metric. For example, binomial_logistic.
	 * <p>
	 * API name: {@code loss_type}
	 */
	public final String lossType() {
		return this.lossType;
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

		if (ModelTypeHelper.isDefined(this.foldValues)) {
			generator.writeKey("fold_values");
			generator.writeStartArray();
			for (String item0 : this.foldValues) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("loss_type");
		generator.write(this.lossType);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidationLoss}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ValidationLoss> {
		private List<String> foldValues;

		private String lossType;

		/**
		 * Required - Validation loss values for every added decision tree during the
		 * forest growing procedure.
		 * <p>
		 * API name: {@code fold_values}
		 */
		public final Builder foldValues(List<String> value) {
			this.foldValues = value;
			return this;
		}

		/**
		 * Required - Validation loss values for every added decision tree during the
		 * forest growing procedure.
		 * <p>
		 * API name: {@code fold_values}
		 */
		public final Builder foldValues(String... value) {
			this.foldValues = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The type of the loss metric. For example, binomial_logistic.
		 * <p>
		 * API name: {@code loss_type}
		 */
		public final Builder lossType(String value) {
			this.lossType = value;
			return this;
		}

		/**
		 * Builds a {@link ValidationLoss}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidationLoss build() {
			_checkSingleUse();

			return new ValidationLoss(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidationLoss}
	 */
	public static final JsonpDeserializer<ValidationLoss> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ValidationLoss::setupValidationLossDeserializer, Builder::build);

	protected static void setupValidationLossDeserializer(DelegatingDeserializer<ValidationLoss.Builder> op) {

		op.add(Builder::foldValues, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"fold_values");
		op.add(Builder::lossType, JsonpDeserializer.stringDeserializer(), "loss_type");

	}

}
