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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: ml._types.DetectorUpdate

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DetectorUpdate">API
 *      specification</a>
 */
@JsonpDeserializable
public class DetectorUpdate implements JsonpSerializable {
	private final int detectorIndex;

	@Nullable
	private final String description;

	private final List<DetectionRule> customRules;

	// ---------------------------------------------------------------------------------------------

	private DetectorUpdate(Builder builder) {

		this.detectorIndex = ApiTypeHelper.requireNonNullWithDefault(builder.detectorIndex, this, "detectorIndex",
				this.detectorIndex());
		this.description = builder.description;
		this.customRules = ApiTypeHelper.unmodifiable(builder.customRules);

	}

	public static DetectorUpdate of(Function<Builder, ObjectBuilder<DetectorUpdate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A unique identifier for the detector. This identifier is based on
	 * the order of the detectors in the <code>analysis_config</code>, starting at
	 * zero.
	 * <p>
	 * API name: {@code detector_index}
	 */
	public final int detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * A description of the detector.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * An array of custom rule objects, which enable you to customize the way
	 * detectors operate. For example, a rule may dictate to the detector conditions
	 * under which results should be skipped. Kibana refers to custom rules as job
	 * rules.
	 * <p>
	 * API name: {@code custom_rules}
	 */
	public final List<DetectionRule> customRules() {
		return this.customRules;
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

		generator.writeKey("detector_index");
		generator.write(this.detectorIndex);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.customRules)) {
			generator.writeKey("custom_rules");
			generator.writeStartArray();
			for (DetectionRule item0 : this.customRules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DetectorUpdate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DetectorUpdate> {
		private Integer detectorIndex;

		@Nullable
		private String description;

		@Nullable
		private List<DetectionRule> customRules;

		/**
		 * Required - A unique identifier for the detector. This identifier is based on
		 * the order of the detectors in the <code>analysis_config</code>, starting at
		 * zero.
		 * <p>
		 * API name: {@code detector_index}
		 */
		public final Builder detectorIndex(int value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * A description of the detector.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * An array of custom rule objects, which enable you to customize the way
		 * detectors operate. For example, a rule may dictate to the detector conditions
		 * under which results should be skipped. Kibana refers to custom rules as job
		 * rules.
		 * <p>
		 * API name: {@code custom_rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>customRules</code>.
		 */
		public final Builder customRules(List<DetectionRule> list) {
			this.customRules = _listAddAll(this.customRules, list);
			return this;
		}

		/**
		 * An array of custom rule objects, which enable you to customize the way
		 * detectors operate. For example, a rule may dictate to the detector conditions
		 * under which results should be skipped. Kibana refers to custom rules as job
		 * rules.
		 * <p>
		 * API name: {@code custom_rules}
		 * <p>
		 * Adds one or more values to <code>customRules</code>.
		 */
		public final Builder customRules(DetectionRule value, DetectionRule... values) {
			this.customRules = _listAdd(this.customRules, value, values);
			return this;
		}

		/**
		 * An array of custom rule objects, which enable you to customize the way
		 * detectors operate. For example, a rule may dictate to the detector conditions
		 * under which results should be skipped. Kibana refers to custom rules as job
		 * rules.
		 * <p>
		 * API name: {@code custom_rules}
		 * <p>
		 * Adds a value to <code>customRules</code> using a builder lambda.
		 */
		public final Builder customRules(Function<DetectionRule.Builder, ObjectBuilder<DetectionRule>> fn) {
			return customRules(fn.apply(new DetectionRule.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DetectorUpdate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DetectorUpdate build() {
			_checkSingleUse();

			return new DetectorUpdate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DetectorUpdate}
	 */
	public static final JsonpDeserializer<DetectorUpdate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DetectorUpdate::setupDetectorUpdateDeserializer);

	protected static void setupDetectorUpdateDeserializer(ObjectDeserializer<DetectorUpdate.Builder> op) {

		op.add(Builder::detectorIndex, JsonpDeserializer.integerDeserializer(), "detector_index");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::customRules, JsonpDeserializer.arrayDeserializer(DetectionRule._DESERIALIZER), "custom_rules");

	}

}
