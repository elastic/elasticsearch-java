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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.elasticsearch._types.LifecycleOperationMode;
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
import java.lang.Long;
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

// typedef: _global.health_report.IlmIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.IlmIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class IlmIndicatorDetails implements JsonpSerializable {
	private final LifecycleOperationMode ilmStatus;

	private final long policies;

	private final int stagnatingIndices;

	// ---------------------------------------------------------------------------------------------

	private IlmIndicatorDetails(Builder builder) {

		this.ilmStatus = ApiTypeHelper.requireNonNull(builder.ilmStatus, this, "ilmStatus");
		this.policies = ApiTypeHelper.requireNonNull(builder.policies, this, "policies");
		this.stagnatingIndices = ApiTypeHelper.requireNonNull(builder.stagnatingIndices, this, "stagnatingIndices");

	}

	public static IlmIndicatorDetails of(Function<Builder, ObjectBuilder<IlmIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code ilm_status}
	 */
	public final LifecycleOperationMode ilmStatus() {
		return this.ilmStatus;
	}

	/**
	 * Required - API name: {@code policies}
	 */
	public final long policies() {
		return this.policies;
	}

	/**
	 * Required - API name: {@code stagnating_indices}
	 */
	public final int stagnatingIndices() {
		return this.stagnatingIndices;
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

		generator.writeKey("ilm_status");
		this.ilmStatus.serialize(generator, mapper);
		generator.writeKey("policies");
		generator.write(this.policies);

		generator.writeKey("stagnating_indices");
		generator.write(this.stagnatingIndices);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IlmIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IlmIndicatorDetails> {
		private LifecycleOperationMode ilmStatus;

		private Long policies;

		private Integer stagnatingIndices;

		/**
		 * Required - API name: {@code ilm_status}
		 */
		public final Builder ilmStatus(LifecycleOperationMode value) {
			this.ilmStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 */
		public final Builder policies(long value) {
			this.policies = value;
			return this;
		}

		/**
		 * Required - API name: {@code stagnating_indices}
		 */
		public final Builder stagnatingIndices(int value) {
			this.stagnatingIndices = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IlmIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IlmIndicatorDetails build() {
			_checkSingleUse();

			return new IlmIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IlmIndicatorDetails}
	 */
	public static final JsonpDeserializer<IlmIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IlmIndicatorDetails::setupIlmIndicatorDetailsDeserializer);

	protected static void setupIlmIndicatorDetailsDeserializer(ObjectDeserializer<IlmIndicatorDetails.Builder> op) {

		op.add(Builder::ilmStatus, LifecycleOperationMode._DESERIALIZER, "ilm_status");
		op.add(Builder::policies, JsonpDeserializer.longDeserializer(), "policies");
		op.add(Builder::stagnatingIndices, JsonpDeserializer.integerDeserializer(), "stagnating_indices");

	}

}
