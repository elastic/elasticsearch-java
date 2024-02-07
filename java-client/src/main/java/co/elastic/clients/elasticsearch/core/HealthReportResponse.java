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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.health_report.IndicatorHealthStatus;
import co.elastic.clients.elasticsearch.core.health_report.Indicators;
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
import java.lang.String;
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

// typedef: _global.health_report.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.health_report.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class HealthReportResponse implements JsonpSerializable {
	private final String clusterName;

	private final Indicators indicators;

	@Nullable
	private final IndicatorHealthStatus status;

	// ---------------------------------------------------------------------------------------------

	private HealthReportResponse(Builder builder) {

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.indicators = ApiTypeHelper.requireNonNull(builder.indicators, this, "indicators");
		this.status = builder.status;

	}

	public static HealthReportResponse of(Function<Builder, ObjectBuilder<HealthReportResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code indicators}
	 */
	public final Indicators indicators() {
		return this.indicators;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final IndicatorHealthStatus status() {
		return this.status;
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

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("indicators");
		this.indicators.serialize(generator, mapper);

		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthReportResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HealthReportResponse> {
		private String clusterName;

		private Indicators indicators;

		@Nullable
		private IndicatorHealthStatus status;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code indicators}
		 */
		public final Builder indicators(Indicators value) {
			this.indicators = value;
			return this;
		}

		/**
		 * Required - API name: {@code indicators}
		 */
		public final Builder indicators(Function<Indicators.Builder, ObjectBuilder<Indicators>> fn) {
			return this.indicators(fn.apply(new Indicators.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable IndicatorHealthStatus value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HealthReportResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthReportResponse build() {
			_checkSingleUse();

			return new HealthReportResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HealthReportResponse}
	 */
	public static final JsonpDeserializer<HealthReportResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HealthReportResponse::setupHealthReportResponseDeserializer);

	protected static void setupHealthReportResponseDeserializer(ObjectDeserializer<HealthReportResponse.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::indicators, Indicators._DESERIALIZER, "indicators");
		op.add(Builder::status, IndicatorHealthStatus._DESERIALIZER, "status");

	}

}
